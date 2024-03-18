from matplotlib import rcParams
rcParams['font.family'] = 'Arial Unicode MS'
import matplotlib.pyplot as plt
tick_name = ['iTBS Research', 'Engage Prism 2.0 Research', 'Antibody Plasma Research', 'OCEAN Research', 'Methylphenidate Research', 'Fluticasone Research']
china_gdp = [28.38, 23.27, 24.3, 34.39, 36.39, 41.439]
usa_gdp = [26.2, 25.37, 24.12, 23.12, 24.73, 26.97]
a = 3
b = 8
x1 = [(i + 1) * b for i in range(6)]
x2 = [(i + 1) * b + a for i in range(6)]
x3 = [(i + 1) * b + a/2 for i in range(6)]
fig = plt.figure(figsize=(8, 8))
ax1 = fig.add_subplot(1, 1, 1)

plt.bar(x1, china_gdp, width=a, color='yellowgreen',label="Running Server")
plt.bar(x2, usa_gdp, width=a, color='lightskyblue',label="Running Client")
ticks = ax1.set_xticks(x3) # 设置刻度
labels = ax1.set_xticklabels(tick_name, rotation=30, fontsize = 'small') # 设置刻度标签
ax1.set_title("CPU Maximum Usage")
plt.xlabel("Research")
plt.ylabel("Maximum Usage Rate(%)")
plt.legend()  # 显示图例
plt.show()
